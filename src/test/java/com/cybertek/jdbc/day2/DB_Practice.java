package com.cybertek.jdbc.day2;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DB_Practice {

    public static void main(String[] args) throws SQLException {

        // print out all data from Jobs Table
        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM JOBS");
        // ITERATE OVER THE RESULTSET
//        rs.next();
//        // get first 2 column
//        System.out.println(  rs.getString(1)  );
         while(rs.next() ){
             System.out.println(  rs.getString(1)  );
         }

        System.out.println("colCount = " + DB_Utility.getColumnCNT() );



        // what if we want to print out everything in the resultset
        // without knowing the column names





    }

}
