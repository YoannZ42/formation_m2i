package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DAO.UtileConnection;
import entity.Follower;

public class FollowersServiceTest {

	
//	@BeforeAll -> 1 fois au début de la classe de test 
//	@AfterAll ->  1 fois au après tout nos tests
	
//  @BeforeEach -> avant chaques tests
//  @AfterEach -> après chaques tests
	
	public FollowersService service;
	
	
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		
		service = new FollowersService();	
		System.out.println("Before All");
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		System.out.println("After All");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");

	}
	
	@Test
	public void test_add_follower_and_get_it_back() throws SQLException {
		
		Follower f = new Follower(45, "Toto");

		service.add(f);
		
		Connection con = UtileConnection.seConnecter();
		
		ResultSet rs = con.createStatement().executeQuery
				("SELECT * FROM followers WHERE age=45, name='toto'");
		
		assertTrue(rs.next());
		
		rs.close();
		con.close();
		
	}
	
	
	
	
}
