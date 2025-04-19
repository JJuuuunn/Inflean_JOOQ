package com.jjuuuunn.study.jooq;

import org.jooq.DSLContext;
import org.jooq.generated.tables.JActor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JooqApplicationTests {

    @Autowired
    DSLContext dslContext;

    @Test
    void test() {
        dslContext.selectFrom(JActor.ACTOR)
                .where(JActor.ACTOR.FIRST_NAME.eq("John"))
                .fetch()
                .forEach(System.out::println);
    }

}
