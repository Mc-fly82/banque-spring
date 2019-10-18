package com.formation.ms2i.tp.banque;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.services.ClientService;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@RunWith(SpringRunner.class)
	@SpringBootTest
	static class ClientServiceUnitTest {

		@Autowired
		private ClientService clientService;

		@Test
		void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
			List<Client> clients = clientService.list();
			Assert.assertEquals(clients.size(), 2);
		}
	}
}
