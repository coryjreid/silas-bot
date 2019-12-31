package com.coryjreid.silas;

import java.util.Map;

public class SilasConfig {
    public static final String DISCORD_TOKEN;
    public static final String DISCORD_OWNER_ID;

    static {
        Map<String, String> env = System.getenv();
        DISCORD_TOKEN = env.get("SILAS_DISCORD_TOKEN");
        DISCORD_OWNER_ID = env.get("SILAS_DISCORD_OWNER_ID");
    }
}
