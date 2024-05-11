//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: wpole_18_slope
// Model Creator: 
// Created on: 05.07.2020 - 22:04:54
// Last changed on: 05.07.2020 - 22:04:54

package com.bidahochi.BlockMod.render.models.Overheads; //Path where the model is located

import com.bidahochi.BlockMod.render.tmt.ModelConverter;
import com.bidahochi.BlockMod.render.tmt.ModelRendererTurbo;

public class Modelwpole_18_slope2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Modelwpole_18_slope2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 18, 90, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 25, 27, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 18, 32, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 46, 29, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 39, 30, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 18, 32, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 46, 29, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 39, 30, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 3
		bodyModel[15] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 145, 44, textureX, textureY); // Box 12
		bodyModel[17] = new ModelRendererTurbo(this, 128, 44, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 48, 44, textureX, textureY); // Box 16
		bodyModel[19] = new ModelRendererTurbo(this, 145, 44, textureX, textureY); // Box 12
		bodyModel[20] = new ModelRendererTurbo(this, 128, 44, textureX, textureY); // Box 15
		bodyModel[21] = new ModelRendererTurbo(this, 48, 44, textureX, textureY); // Box 16
		bodyModel[22] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[23] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[27] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[32] = new ModelRendererTurbo(this, 22, 49, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		bodyModel[34] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Box 29
		bodyModel[36] = new ModelRendererTurbo(this, 18, 85, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[38] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[39] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[40] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[41] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[42] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[43] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3
		bodyModel[44] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 3

		bodyModel[0].addBox(0F, 0F, 0F, 4, 89, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-135F, -79F, -46.5F);
		bodyModel[0].rotateAngleY = 3.12413936F;

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 38, 0F); // Box 1
		bodyModel[1].setRotationPoint(-135F, -53F, -8.5F);
		bodyModel[1].rotateAngleY = 3.12413936F;

		bodyModel[2].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 3
		bodyModel[2].setRotationPoint(-138F, -67.5F, -50.5F);
		bodyModel[2].rotateAngleY = 3.12413936F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-138F, -68F, -50.5F);
		bodyModel[3].rotateAngleY = 3.12413936F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 144, 1, 2, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-136F, -48F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 1
		bodyModel[5].setRotationPoint(-136.5F, -56F, -17F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.25F, -0.05F, -0.5F, 0.25F, -0.05F, -0.5F, 0.25F, -0.05F, 0F, 0.25F, -0.05F); // Box 2
		bodyModel[6].setRotationPoint(7.5F, -43.13F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[7].setRotationPoint(-126F, -53F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[8].setRotationPoint(-116F, -51.4F, -17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F); // Box 3
		bodyModel[9].setRotationPoint(-106F, -50F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F); // Box 3
		bodyModel[10].setRotationPoint(-96F, -49F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, -0.5F, 0.25F, -0.05F); // Box 2
		bodyModel[11].setRotationPoint(-280.5F, -59F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[12].setRotationPoint(-146F, -54F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[13].setRotationPoint(-156F, -53.6F, -17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F, 0F, 0.125F, -0.05F); // Box 3
		bodyModel[14].setRotationPoint(-166F, -53.4F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F); // Box 3
		bodyModel[15].setRotationPoint(-176F, -53.3F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[16].setRotationPoint(-136F, -56F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[17].setRotationPoint(-126F, -53.5F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 107, 1, 2, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[18].setRotationPoint(-99F, -50F, -17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 12
		bodyModel[19].setRotationPoint(-146F, -56F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[20].setRotationPoint(-173F, -54F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 107, 1, 2, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[21].setRotationPoint(-280F, -60F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[22].setRotationPoint(-226F, -56.4F, -17F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[23].setRotationPoint(-216F, -55.8F, -17F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[24].setRotationPoint(-206F, -55.2F, -17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[25].setRotationPoint(-196F, -54.7F, -17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[26].setRotationPoint(-186F, -54.2F, -17F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[27].setRotationPoint(-86F, -48.75F, -17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[28].setRotationPoint(-76F, -48.2F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[29].setRotationPoint(-66F, -47.6F, -17F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[30].setRotationPoint(-56F, -47F, -17F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[31].setRotationPoint(-46F, -46.5F, -17F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 0, 34, 0F); // Box 2
		bodyModel[32].setRotationPoint(-135.5F, -53F, -16.5F);
		bodyModel[32].rotateAngleX = 0.4712389F;
		bodyModel[32].rotateAngleY = 3.12413936F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 5
		bodyModel[33].setRotationPoint(-137F, -54F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 28
		bodyModel[34].setRotationPoint(-137F, -55F, -17F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[35].setRotationPoint(-136.5F, -55F, -16.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 144, 1, 2, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-280F, -56F, -17F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[37].setRotationPoint(-36F, -45.9F, -17F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[38].setRotationPoint(-26F, -45.3F, -17F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[39].setRotationPoint(-16F, -44.8F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[40].setRotationPoint(-6F, -44.2F, -17F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[41].setRotationPoint(-266F, -58.6F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[42].setRotationPoint(-256F, -58.2F, -17F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[43].setRotationPoint(-246F, -57.6F, -17F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 3
		bodyModel[44].setRotationPoint(-236F, -57F, -17F);
	}
}