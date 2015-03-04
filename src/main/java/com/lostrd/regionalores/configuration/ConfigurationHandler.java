package com.lostrd.regionalores.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by lost_RD on 4/03/2015.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration((configFile));
        boolean configValue = false;

        try
        {
            configuration.load();
            configValue = configuration.get("Example Category", "configValue", true, "example config value").getBoolean(true);
        }
        catch(Exception e)
        {
            //log the exception
        }
        finally
        {
            configuration.save();
        }

        System.out.println("Configuration test: " + configValue);
    }
}
