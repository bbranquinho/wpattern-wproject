package org.wproject.server.test.database;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/ctx-wproject-server-test-database.xml" })
public abstract class AbstractDatabaseTest {

}
