import static org.junit.Assert.*;

import org.junit.Test;

import com.rmodadu.example.Connection;
import com.rmodadu.example.ConnectionFactory;
import com.rmodadu.example.ConnectionValidator;
import com.rmodadu.pool.Pool;
import com.rmodadu.pool.impl.BlockingResourcePool;

public class ConnectionPoolTest {

	@Test
	public void test() {
		Pool < Connection > pool = 
				   new BlockingResourcePool < Connection > (
				    10, 
				    new ConnectionValidator(),
				    new ConnectionFactory("user", "pass")
				    );
		Connection conn = pool.get();
		assertEquals(true,conn.isActive());
	}
}
