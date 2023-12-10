package me.minsu.blog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BlogApplicationTests {

	@Test
	@DisplayName("1 plus 2 is 3")
	void contextLoads() {
		int a = 1;
		int b = 2;
		int sum = 3;

		assertThat(a + b).isEqualTo(sum);

	}

}
