package com.mercadolibre.www.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by kprox
 */
public class Config {

    private Properties props;
    private final static String PROPERTIES_FILE = "ConfigData.properties";

    //KEYS
    private final static String ID = "test_user_id";
    private final static String USERNAME = "test_user_name";
    private final static String PASSWORD = "test_user_pass";
    private final static String NICKNAME = "test_user_nick";
    private final static String LOGIN_LINK = "link";

    public Config() {
        props = new Properties();

        try {
            InputStream input = Config.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
            props.load(input);
        } catch (IOException e) {
            System.out.println("ERROR: Could not load Properties file");
        }
    }

    /**
     * Returns Test User ID
     *
     * @return
     */
    public String getTestUserId() {
        return props.getProperty(ID);
    }

    /**
     * Returns Test Username
     *
     * @return
     */
    public String getTestUsername() {
        return props.getProperty(USERNAME);
    }

    /**
     * Returns Test User Password
     *
     * @return
     */
    public String getTestUserPassword() {
        return props.getProperty(PASSWORD);
    }

    /**
     * Returns Test User Nickname
     *
     * @return
     */
    public String getTestUserNickname() {
        return props.getProperty(NICKNAME);
    }

    /**
     * Returns the Impersonalization Link from the system properties provided
     * Can be null
     *
     * @return
     */
    public String getLinkFromSystemProps() {
        return System.getProperty(LOGIN_LINK, null);
    }
}
