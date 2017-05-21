package irpf.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import irpf.negocio.Contribuinte;

public class ContribuinteTest {
	private Contribuinte cl;

	@Before
	public void setUp() throws Exception {
		cl = new Contribuinte("Ial Jonas", "01531075029", 150, 52);
	}
}
