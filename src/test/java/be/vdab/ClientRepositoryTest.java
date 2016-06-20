package be.vdab;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class, })
public class ClientRepositoryTest {
	@Autowired
	private ClientRepository repository;

	@Test
	public void findAll() {
		repository.findAll(Arrays.asList(1L, 2L));
	}
}