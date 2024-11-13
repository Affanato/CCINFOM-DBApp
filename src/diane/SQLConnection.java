import java.sql.*;

public class SQLConnection {
    public static void main(String[] args) {
        
        try {
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/(URL)", "user", "password"); // tinanggal ko yung akin HAHAHAHAH
            Statement state = con.createStatement();

            String queryMember = "CREATE TABLE IF NOT EXISTS Member (" +
                     "memberid INT NOT NULL AUTO_INCREMENT, " +
                     "name VARCHAR(255), " +
                     "birthday DATE, " +
                     "sex VARCHAR(10), " +
                     "phonenumber VARCHAR(11), " +
                     "street VARCHAR(50), " +
                     "city VARCHAR(50), " +
                     "region VARCHAR(50), " +
                     "country VARCHAR(50), " +
                     "PRIMARY KEY (memberid))";
            state.executeUpdate(queryMember);


            String queryBranch = "CREATE TABLE IF NOT EXISTS Branch (" +
                     "branchid INT NOT NULL AUTO_INCREMENT, " +
                     "branchname VARCHAR(255), " +
                     "street VARCHAR(50), " +
                     "city VARCHAR(50), " +
                     "region VARCHAR(50), " +
                     "country VARCHAR(50), " +
                     "telephone VARCHAR(15), " +
                     "emailaddress VARCHAR(255), " +
                     "status VARCHAR(20), " +
                     "businesshours VARCHAR(50), " +
                     "managername VARCHAR(255), " +
                     "managercontact VARCHAR(15), " +
                     "membershipplans VARCHAR(255), " +
                     "PRIMARY KEY (branchid))";
            state.executeUpdate(queryBranch);

            String queryMembership = "CREATE TABLE IF NOT EXISTS Membership (" +
                    "membershipid INT NOT NULL AUTO_INCREMENT, " +
                    "branchid INT, " +
                    "memberid INT, " +
                    "startdate DATE, " +
                    "enddate DATE, " +
                    "type VARCHAR(50), " +
                    "status VARCHAR(20), " +
                    "price DECIMAL(10, 2), " +
                    "trainerid INT, " +
                    "trainerperformancerating DECIMAL(3, 2), " +
                    "PRIMARY KEY (membershipid), " +
                    "FOREIGN KEY (branchid) REFERENCES Branch(branchid), " +
                    "FOREIGN KEY (memberid) REFERENCES Member(memberid))";
            state.executeUpdate(queryMembership);


            String queryTrainer = "CREATE TABLE IF NOT EXISTS Trainer (" +
                      "branchid INT, " +
                      "trainerid INT NOT NULL AUTO_INCREMENT, " +
                      "name VARCHAR(255), " +
                      "speciality VARCHAR(100), " +
                      "availabilityschedule VARCHAR(255), " +
                      "PRIMARY KEY (trainerid), " +
                      "FOREIGN KEY (branchid) REFERENCES Branch(branchid))";
            state.executeUpdate(queryTrainer);


            String queryProduct = "CREATE TABLE IF NOT EXISTS Product (" +
                      "productid INT NOT NULL AUTO_INCREMENT, " +
                      "productname VARCHAR(255), " +
                      "productprice DECIMAL(10, 2), " +
                      "productdescription TEXT, " +
                      "brand VARCHAR(100), " +
                      "branchid INT, " +
                      "availablequantity INT, " +
                      "quantitysold INT, " +
                      "productrating DECIMAL(3, 2), " +
                      "PRIMARY KEY (productid), " +
                      "FOREIGN KEY (branchid) REFERENCES Branch(branchid))";
            state.executeUpdate(queryProduct);

            String querySales = "CREATE TABLE IF NOT EXISTS Sales (" +
                      "salesid INT NOT NULL AUTO_INCREMENT, " +
                      "saledate DATE, " +
                      "memberid INT, " +
                      "productid INT, " +
                      "quantity INT, " +
                      "priceeach DECIMAL(10, 2), " +
                      "totalprice DECIMAL(10, 2), " +
                      "PRIMARY KEY (salesid), " +
                      "FOREIGN KEY (memberid) REFERENCES Member(memberid), " + 
                      "FOREIGN KEY (productid) REFERENCES Product(productid))"; 
            state.executeUpdate(querySales);


            if (con != null) {
                System.out.println("Datebase is connected.");
            } 

            state.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Datebase is NOT connected.");
        }
    }
}