package com.infamous.dungeons_gear.capabilities.combo;

import com.infamous.dungeons_gear.enchantments.lists.ArmorEnchantmentList;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Combo implements ICombo {

    private float souls;
    private int comboTimer;
    //private boolean ghostForm;
    private boolean shadowForm;

    private int flamingArrowCount;
    private int tormentArrowCount;
    private int thunderingArrowCount;
    private int harpoonCount;

    private int burnNearbyTimer;
    private int freezeNearbyTimer;
    private int snowballNearbyTimer;
    private int gravityPulseTimer;
    private int comboCount;
    private int arrowsInCounter;
    private int jumpCooldownTimer;
    private int poisonImmunityTimer;
    private double dynamoMultiplier;
    private int lastShoutTimer;
    private int offhandCooldown;
    private float cachedCooldown;//no need to be saved, it's stored and used in the span of a tick

    private BlockPos lastExplorerCheckpoint;
    private BlockPos lastLuckyExplorerCheckpoint;
    private boolean artifactSynergy;
    private int painCycleStacks;
    private int rollChargeTicks;
    private int jumpCounter;
    private int refreshmentCounter;

    public Combo() {
        this.souls = 0;
        this.comboTimer = 0;
        this.comboCount = 0;
        //this.ghostForm = false;
        this.shadowForm = false;

        this.flamingArrowCount = 0;
        this.tormentArrowCount = 0;
        this.thunderingArrowCount = 0;
        this.harpoonCount = 0;

        this.arrowsInCounter = 0;
        this.burnNearbyTimer = 10;
        this.burnNearbyTimer = 40;
        this.gravityPulseTimer = 100;
        this.snowballNearbyTimer = 100;
        this.jumpCooldownTimer = 0;
        this.poisonImmunityTimer = 0;
        this.dynamoMultiplier = 1.0D;
        this.lastExplorerCheckpoint = BlockPos.ZERO;
        this.lastLuckyExplorerCheckpoint = BlockPos.ZERO;

        this.artifactSynergy = false;
        this.painCycleStacks = 0;
        this.rollChargeTicks = 0;
        this.jumpCounter = 0;
        this.refreshmentCounter = 0;
    }

    @Override
    public int getComboTimer() {
        return this.comboTimer;
    }

    @Override
    public void setComboTimer(int comboTimer) {
        this.comboTimer = MathHelper.clamp(comboTimer, 0, 300);
    }

    @Override
    public boolean consumeSouls(float amount) {
        if (souls < amount) return false;
        souls -= amount;
        return true;
    }

    @Override
    public float getSouls() {
        return souls;
    }

    @Override
    public float getMaxSouls(@Nullable LivingEntity living) {
        if(living == null) return 300;

        int bagOfSoulsLevel = EnchantmentHelper.getMaxEnchantmentLevel(ArmorEnchantmentList.BAG_OF_SOULS, living);
        if(bagOfSoulsLevel > 0){
            return 300 + (100 * bagOfSoulsLevel);
        } else{
            return 300;
        }
    }

    @Override
    public void setSouls(float soul, @Nullable LivingEntity living) {
        if(living != null){
            this.souls = MathHelper.clamp(soul, 0, this.getMaxSouls(living));
        } else{
            this.souls = Math.max(soul, 0);
        }
    }
/*
    @Override
    public void setGhostForm(boolean ghostForm) {
        this.ghostForm = ghostForm;
    }

    @Override
    public boolean getGhostForm() {
        return this.ghostForm;
    }

 */

    @Override
    public boolean getShadowForm() {
        return this.shadowForm;
    }

    @Override
    public void setShadowForm(boolean shadowForm) {
        this.shadowForm = shadowForm;
    }

    @Override
    public int getFlamingArrowsCount() {
        return this.flamingArrowCount;
    }

    @Override
    public void setFlamingArrowsCount(int flamingArrowsCount) {
        this.flamingArrowCount = flamingArrowsCount;
    }

    @Override
    public int getTormentArrowsCount() {
        return this.tormentArrowCount;
    }

    @Override
    public int getThunderingArrowsCount() {
        return this.thunderingArrowCount;
    }

    @Override
    public int getHarpoonCount() {
        return this.harpoonCount;
    }

    @Override
    public void setTormentArrowCount(int tormentsArrowsCount) {
        this.tormentArrowCount = tormentsArrowsCount;
    }

    @Override
    public void setThunderingArrowsCount(int thunderingArrowsCount) {
        this.thunderingArrowCount = thunderingArrowsCount;
    }

    @Override
    public void setHarpoonCount(int harpoonCount) {
        this.harpoonCount = harpoonCount;
    }

    @Override
    public int getArrowsInCounter() {
        return this.arrowsInCounter;
    }

    @Override
    public void setArrowsInCounter(int arrowsInCounter) {
        this.arrowsInCounter = arrowsInCounter;
    }

    @Override
    public int getBurnNearbyTimer() {
        return this.burnNearbyTimer;
    }

    @Override
    public void setBurnNearbyTimer(int burnNearbyTimer) {
        this.burnNearbyTimer = burnNearbyTimer;
    }

    @Override
    public int getFreezeNearbyTimer() {
        return this.freezeNearbyTimer;
    }

    @Override
    public void setFreezeNearbyTimer(int freezeNearbyTimer) {
        this.freezeNearbyTimer = freezeNearbyTimer;
    }

    @Override
    public int getGravityPulseTimer() {
        return gravityPulseTimer;
    }

    @Override
    public void setGravityPulseTimer(int gravityPulseTimer) {
        this.gravityPulseTimer = gravityPulseTimer;
    }

    @Override
    public int getSnowballNearbyTimer() {
        return this.snowballNearbyTimer;
    }

    @Override
    public void setSnowballNearbyTimer(int snowballTimer) {
        this.snowballNearbyTimer = snowballTimer;
    }

    @Override
    public int getJumpCooldownTimer() {
        return this.jumpCooldownTimer;
    }

    @Override
    public void setJumpCooldownTimer(int jumpCooldownTimer) {
        this.jumpCooldownTimer = jumpCooldownTimer;
    }

    @Override
    public int getPoisonImmunityTimer() {
        return this.poisonImmunityTimer;
    }

    @Override
    public void setPoisonImmunityTimer(int poisonImmunityTimer) {
        this.poisonImmunityTimer = poisonImmunityTimer;
    }

    @Override
    public int getLastShoutTimer() {
        return lastShoutTimer;
    }

    @Override
    public void setLastShoutTimer(int lastShoutTimer) {
        this.lastShoutTimer = lastShoutTimer;
    }

    @Override
    public double getDynamoMultiplier() {
        return this.dynamoMultiplier;
    }

    @Override
    public void setDynamoMultiplier(double dynamoMultiplier) {
        this.dynamoMultiplier = dynamoMultiplier;
    }

    @Override
    public int getComboCount() {
        return comboCount;
    }

    @Override
    public void setComboCount(int comboCount) {
        this.comboCount = comboCount;
    }

    @Override
    public int getOffhandCooldown() {
        return offhandCooldown;
    }

    @Override
    public void setOffhandCooldown(int cooldown) {
        offhandCooldown = comboCount;
    }

    @Override
    public float getCachedCooldown() {
        return cachedCooldown;
    }

    @Override
    public void setCachedCooldown(float cooldown) {
        cachedCooldown = cooldown;
    }

    @Override
    public BlockPos getLastExplorerCheckpoint() {
        return this.lastExplorerCheckpoint;
    }

    @Override
    public void setLastExplorerCheckpoint(BlockPos blockPos) {
        this.lastExplorerCheckpoint = blockPos;
    }

    @Override
    public BlockPos getLastLuckyExplorerCheckpoint() {
        return this.lastLuckyExplorerCheckpoint;
    }

    @Override
    public void setLastLuckyExplorerCheckpoint(BlockPos blockPos) {
        this.lastLuckyExplorerCheckpoint = blockPos;
    }

    @Override
    public boolean hasArtifactSynergy() {
        return this.artifactSynergy;
    }

    @Override
    public void setArtifactSynergy(boolean artifactSynergy) {
        this.artifactSynergy = artifactSynergy;
    }

    @Override
    public int getPainCycleStacks() {
        return this.painCycleStacks;
    }

    @Override
    public void setPainCycleStacks(int painCycleStacks) {
        this.painCycleStacks = painCycleStacks;
    }

    @Override
    public int getRollChargeTicks() {
        return this.rollChargeTicks;
    }

    @Override
    public void setRollChargeTicks(int rollChargeTicks) {
        this.rollChargeTicks = rollChargeTicks;
    }

    @Override
    public int getJumpCounter() {
        return jumpCounter;
    }

    @Override
    public void setJumpCounter(int jumpCounter) {
        this.jumpCounter = jumpCounter;
    }

    @Override
    public int getRefreshmentCounter() {
        return refreshmentCounter;
    }

    @Override
    public void setRefreshmentCounter(int refreshmentCounter) {
        this.refreshmentCounter = refreshmentCounter;
    }
}
