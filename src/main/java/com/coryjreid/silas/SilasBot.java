package com.coryjreid.silas;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class SilasBot {
    public static final Logger LOGGER = LoggerFactory.getLogger(SilasBot.class);

    public static void main(String[] args) {
        try {
            new JDABuilder(SilasConfig.DISCORD_TOKEN)
                    .addEventListeners(new SilasListener())
                    .setActivity(Activity.playing("Type !ping"))
                    .build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
