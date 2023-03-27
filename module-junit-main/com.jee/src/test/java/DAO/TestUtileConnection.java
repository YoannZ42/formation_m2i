package DAO;

import java.sql.Connection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestUtileConnection {
	@Test 
	public void test_connection_object_is_returned() {
		Connection con = UtileConnection.seConnecter();
		assertNotNull(con);	
	}
}
