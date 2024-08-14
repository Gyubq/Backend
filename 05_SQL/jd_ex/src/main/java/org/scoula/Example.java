package org.scoula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보 설정
        String url = "jdbc:mysql://localhost:3306/exampledb"; // 데이터베이스 URL
        String user = "root"; // 데이터베이스 사용자명
        String password = "password"; // 데이터베이스 비밀번호

        Connection conn = null; // 데이터베이스 연결을 위한 Connection 객체 선언
        PreparedStatement pstmt = null; // SQL 쿼리를 실행하기 위한 PreparedStatement 객체 선언
        ResultSet rs = null; // 쿼리 실행 결과를 저장하기 위한 ResultSet 객체 선언

        try {
            // 데이터베이스 연결 생성
            conn = DriverManager.getConnection(url, user, password);

            // 파라미터가 포함된 쿼리문
            String query = "SELECT * FROM Users WHERE age = ?";

            // PreparedStatement 객체 생성 및 파라미터 바인딩
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 30); // 첫 번째 물음표(?)에 30을 대입

            // 쿼리 실행 및 결과 저장
            rs = pstmt.executeQuery();

            // 쿼리 결과 처리
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // SQL 예외 발생 시 스택 트레이스 출력
        } finally {
            // 자원 해제
            try {
                if (rs != null) rs.close(); // ResultSet 객체 해제
                if (pstmt != null) pstmt.close(); // PreparedStatement 객체 해제
                if (conn != null) conn.close(); // Connection 객체 해제
            } catch (SQLException e) {
                e.printStackTrace(); // 자원 해제 중 예외 발생 시 스택 트레이스 출력
            }
        }
    }
}
