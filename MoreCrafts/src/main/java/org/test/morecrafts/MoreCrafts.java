package org.test.morecrafts;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MoreCrafts extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //显示插件已启用
        //添加类里面的合成表
        craft.createCraft();
        //head命令添加
        getLogger().info("===========MoreCrafts插件已启用v1.11==========");
        getLogger().info("===============================ZZZLLL=");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //清理合成表
        craft.deleteCraft();
        getLogger().info("===========MoreCrafts插件已关闭===========");
        getLogger().info("===============================ZZZLLL=");




    }
}
