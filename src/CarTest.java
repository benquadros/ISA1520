import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	Car c1;
	int result;

	@Before
	public void setUp() throws Exception {
		c1 = new Car(5000);
	}

	@Test
	public void testGetEngineCapacity() {
		result=c1.getEngineCapacity();
		assertEquals(5000,result);
	}

}
