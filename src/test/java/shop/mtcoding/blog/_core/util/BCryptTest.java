package shop.mtcoding.blog._core.util;

import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;

public class BCryptTest { //hashpw 잘돼는지 확인

    //$2a$10$3RtAUoVmMtFLXyUVhWS1..
    //$2a$10$JExZcXkxX/XmVn7sNMcocu
    @Test
    public void gensalt_test() {
        String salt = BCrypt.gensalt();
        System.out.println(salt);
    }


    //$2a$10$ZwTuDPYMtANShukyzQpx.OmLxFbT4UM2PY2Vn4g.oZFnrgnQJf6zy
    //$2a$10$O.DuqbeqD2/.w90llRjw9.yfLzQ8CgX8/UJa4owzC55hf8.c8Potu
    @Test
    public void hashpw_test() {
        String rawPassword = "1234";
        String encPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());
        System.out.println(encPassword);

    }
}
