package net.mcreator.mystics.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfire_hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mystics", "modelfire_hat"), "main");
	public final ModelPart fire_hat;

	public Modelfire_hat(ModelPart root) {
		this.fire_hat = root.getChild("fire_hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition fire_hat = partdefinition.addOrReplaceChild("fire_hat",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.5F, -1.0F, 1.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-13.5F, -4.0F, 3.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.0F, 19.0F, -15.0F));
		PartDefinition cube_r1 = fire_hat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 28).addBox(2.5F, -6.0F, 0.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -7.0F, 7.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = fire_hat.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -5.0F, 0.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -4.0F, 4.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fire_hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
