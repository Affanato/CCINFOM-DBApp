import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES
    public boolean insertMember(Member m) {
        String sql = "INSERT INTO members (last_name, first_name, birthdate, sex, phone_number, street, barangay, city, province) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, m.lastName());
            ps.setString(2, m.firstName());
            ps.setDate(3, Date.valueOf(m.birthdate()));
            ps.setString(4, m.sex().toString());
            ps.setString(5, m.phoneNumber());
            ps.setString(6, m.street());
            ps.setString(7, m.barangay());
            ps.setString(8, m.city());
            ps.setString(9, m.province());

            ps.executeUpdate();
            System.out.println("Member record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    // TODO: Please update product_purchases and training_sessions corresponding delete methods (not functions HAHAHA)
    //       to update their foreign keys to 0 first before deleting, i.e., call invalidate method as seen below.
    public boolean deleteMember(int memberID) {
        if (!memberExists(memberID)) return false;
        DBUtils.invalidateTableForeignKey("amenity_logs", "member_id", memberID);
        DBUtils.invalidateTableForeignKey("subscriptions", "member_id", memberID);
        DBUtils.invalidateTableForeignKey("product_purchases", "member_id", memberID);
        DBUtils.deleteTableRecordsByKey("members", "member_id", memberID);
        return true;
    }

    public boolean updateMember(int memberID, Member m) {
        if (!DBUtils.primaryKeyExistsInATable("members", "member_id", memberID)) {
            return false;
        }

        String sql = "UPDATE members " +
                "SET last_name = ?, " +
                "    first_name = ?, " +
                "    birthdate = ?, " +
                "    sex = ?, " +
                "    phone_number = ?, " +
                "    street = ?, " +
                "    barangay = ?, " +
                "    city = ?, " +
                "    province = ? " +
                "WHERE member_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, m.lastName());
            ps.setString(2, m.firstName());
            ps.setDate(3, Date.valueOf(m.birthdate()));
            ps.setString(4, String.valueOf(m.sex().toString().charAt(0)));
            ps.setString(5, m.phoneNumber());
            ps.setString(6, m.street());
            ps.setString(7, m.barangay());
            ps.setString(8, m.city());
            ps.setString(9, m.province());
            ps.setInt(10, memberID);  // Identifying the record to update by memberID

            ps.executeUpdate();
            System.out.println("Member record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
        return true;
    }

    // SELECT QUERIES
    public static Member selectMember(int memberID) {
        String condition = "WHERE member_id = " + memberID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("members", condition);
        assert rs != null;
        return mapResultSetToMember(rs);
    }

    public Object[][] selectAllMembers() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("members");
        assert rs != null;
<<<<<<< Updated upstream
        return mapResultSetToMembersArr(rs);
    }

    // TRANSACTIONS / REC MANAGEMENT
    public boolean insertMember(
        String lastName,
        String firstName,
        String birthdate,
        String sex,
        String phoneNumber,
        String street,
        String barangay,
        String city,
        String province
    ) {
        String sql = "INSERT INTO members (last_name, first_name, birthdate, sex, phone_number, street, barangay, city, province) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setDate(3, Date.valueOf(birthdate));
            ps.setString(4, sex);
            ps.setString(5, phoneNumber);
            ps.setString(6, street);
            ps.setString(7, barangay);
            ps.setString(8, city);
            ps.setString(9, province);
            ps.setString(10, "Active");

            ps.executeUpdate();
            System.out.println("Trainer record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    public boolean updateMember(
            int memberID,
            String lastName,
            String sex,
            String phoneNumber,
            String street,
            String barangay,
            String city,
            String province
    ) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", memberID)) {
            return false;
        }

        Member oldMember = selectMember(memberID);
        Member updatedMember = new Member(
            memberID,
            lastName,
            oldMember.firstName(),
            oldMember.birthdate(),
            Sex.valueOf(sex),
            phoneNumber,
            street,
            barangay,
            city,
            province
        );
        return updateMember(memberID, updatedMember);
    }

    // UTIL METHODS
    public static boolean memberExists(int memberID) {
        return selectMember(memberID) != null;
    }

    public static Member mapResultSetToMember(ResultSet rs) {
        try {
            if (!rs.next()) {
                System.out.println("No Member ResultSet data.\n");
                return null;
            }

            int memberID = rs.getInt("member_id");
            String lastName = rs.getString("last_name");
            String firstName = rs.getString("first_name");
            LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
            Sex sex = Sex.valueOf(rs.getString("sex"));
            String phoneNumber = rs.getString("phone_number");
            String street = rs.getString("street");
            String barangay = rs.getString("barangay");
            String city = rs.getString("city");
            String province = rs.getString("province");

            return new Member(memberID, lastName, firstName, birthdate, sex, phoneNumber, street, barangay, city, province);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<Member> mapResultSetToMemberList(ResultSet rs) {
        ArrayList<Member> memberList = new ArrayList<Member>();
        try {
            while (rs.next()) {
                memberList.add(mapResultSetToMember(rs));
            }
            return memberList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[] mapResultSetToMemberArr(ResultSet rs) {
        try {
            return new Object[] {
                    rs.getInt("member_id"),
                    rs.getString("last_name"),
                    rs.getString("first_name"),
                    rs.getDate("birthdate").toString(),
                    rs.getString("sex"),
                    rs.getString("phone_number"),
                    rs.getString("street"),
                    rs.getString("barangay"),
                    rs.getString("city"),
                    rs.getString("province"),
                    rs.getString("trainer_status")
            };
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[][] mapResultSetToMembersArr(ResultSet rs) {
        List<Object[]> amenitiesArr = new ArrayList<Object[]>();

        try {
            while (rs.next()) {
                amenitiesArr.add(mapResultSetToMemberArr(rs));
            }
            return amenitiesArr.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static int getCurrentSubscriptionID(int memberID) {
        String sql = "SELECT        s.subscription_id " +
                     "FROM          members m " +
                     "JOIN          subscriptions s ON m.member_id = s.member_id " +
                     "WHERE         m.member_id = ? " +
                     "AND           CURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return -1;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return -1;
    }

    public static int getCurrentSubscriptionTypeID(int memberID) {
        String sql = "SELECT        s.subscription_type_id " +
                     "FROM          members m " +
                     "JOIN          subscriptions s ON m.member_id = s.member_id " +
                     "WHERE         m.member_id = ? " +
                     "AND           CURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return -1;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return -1;
    }

    public String[] getComboBoxMemberIDs() {
        return DBUtils.selectAllKeysFromTable("members", "member_id");
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
