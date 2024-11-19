package org.test.morecrafts;

import com.destroystokyo.paper.profile.PlayerProfile;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;


public class craft {

    //新建立合成表
    public static void createCraft() {
     //获取指定玩家的头颅
        //ItemStack zuiliuhead = new ItemStack(Material.PLAYER_HEAD);
        //PlayerProfile profile = Bukkit.createProfile("ZuiLiu_aaaaab");
        //SkullMeta meta = (SkullMeta) zuiliuhead.getItemMeta();
        //meta.setPlayerProfile(profile);
        //zuiliuhead.setItemMeta(meta);



        //合成表
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey("morecrafts", "test"), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE,1));
        ShapedRecipe recipe1 = new ShapedRecipe(new NamespacedKey("morecrafts", "test1"), new ItemStack(Material.ELYTRA,1));

        //合成表格式
        recipe.shape("AAA","ABA","AAA");
        recipe1.shape("CDC","EFE","EFE");

        //合成表材料
        recipe.setIngredient('A', Material.GOLD_BLOCK);
        recipe.setIngredient('B', Material.GOLDEN_APPLE);

        recipe1.setIngredient('C', Material.ENDER_EYE);
        recipe1.setIngredient('D', Material.NETHER_STAR);
        recipe1.setIngredient('E', Material.FEATHER);
        recipe1.setIngredient('F', Material.ENCHANTED_GOLDEN_APPLE);



        //添加合成表
        Bukkit.getServer().addRecipe(recipe);
        Bukkit.getServer().addRecipe(recipe1);

    }
     //删除合成表
public  static void deleteCraft(){
    Bukkit.removeRecipe(new NamespacedKey("morecrafts", "test"));
    Bukkit.removeRecipe(new NamespacedKey("morecrafts", "test1"));

}
}
