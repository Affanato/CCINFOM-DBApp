import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.
    // SINGLE UPDATE QUERIES
    public void insertMember(Member m) {
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
        }
    }

    public void deleteMember(int memberID) {
        DBUtils.deleteTableRecordsByKey("members", "member_id", memberID);
    }

    public void updateMember(int memberID, Member m) {
        if (!DBUtils.primaryKeyExistsInATable("members", "member_id", memberID)) {
            return;
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
            ps.setString(4, m.sex().toString());
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
    }


    // SELECT QUERIES
    public static Member selectMember(int memberID) {
        String condition = "WHERE member_id = " + memberID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("members", condition);
        assert rs != null;
        return mapResultSetToMember(rs);
    }

    public ArrayList<Member> selectAllMembers() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("members");
        assert rs != null;
        return mapResultSetToMemberList(rs);
    }




    // UTIL METHODS
    public static Member mapResultSetToMember(ResultSet rs) {
        try {
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


    public static int getCurrentSubscriptionTypeID(int memberID) {
        String sql = "SELECT\t\t\ts.subscription_type_id " +
                     "FROM\t\t\tmembers m " +
                     "JOIN\t\t\tsubscriptions s ON m.member_id = s.member_id " +
                     "WHERE\t\t\tm.member_id = ? " +
                     "AND\t\t\t\tCURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

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

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
