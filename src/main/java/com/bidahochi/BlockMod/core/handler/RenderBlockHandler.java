package com.bidahochi.BlockMod.core.handler;

import com.bidahochi.BlockMod.blocks.bridgestuff.*;
import com.bidahochi.BlockMod.blocks.constructionmaterials.RenderBreakerBox;
import com.bidahochi.BlockMod.blocks.constructionmaterials.RenderBreakerBox2;
import com.bidahochi.BlockMod.blocks.constructionmaterials.TileBreakerBox;
import com.bidahochi.BlockMod.blocks.constructionmaterials.TileBreakerBox2;
import com.bidahochi.BlockMod.blocks.constructionmaterials.roadcover.RenderRoadCover0;
import com.bidahochi.BlockMod.blocks.constructionmaterials.roadcover.*;
import com.bidahochi.BlockMod.blocks.lighting.RenderNeonCageLampRoof;
import com.bidahochi.BlockMod.blocks.lighting.*;
import com.bidahochi.BlockMod.blocks.lighting.TileNeonCageLampRoof;
import com.bidahochi.BlockMod.blocks.lumber.*;
import com.bidahochi.BlockMod.blocks.metals.Scaffold;
import com.bidahochi.BlockMod.blocks.overhead.*;
import com.bidahochi.BlockMod.blocks.props.*;
import com.bidahochi.BlockMod.render.BlockRenderScaffolds;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderBlockHandler {
    public static int scaffoldRenderId = RenderingRegistry.getNextAvailableRenderId();
    public static void initializeCustomModels() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBreakerBox.class, new RenderBreakerBox());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBreakerBox2.class, new RenderBreakerBox2());

        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignDerail.class, new RenderClampOnSignDerail());
        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignStop1.class, new RenderClampOnSignStop1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignStop2.class, new RenderClampOnSignStop2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignGreen.class, new RenderWaysideWarningSignGreen());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignRed.class, new RenderWaysideWarningSignRed());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignYellow.class, new RenderWaysideWarningSignYellow());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignYellowRed.class, new RenderWaysideWarningSignYellowRed());

        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampRoof.class, new RenderNeonCageLampRoof());
        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampWallV.class, new RenderNeonCageLampWallV());
        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampWallH.class, new RenderNeonCageLampWallH());
        ClientRegistry.bindTileEntitySpecialRenderer(TileExteriorLightSquare.class, new RenderExteriorLightSquare());
        ClientRegistry.bindTileEntitySpecialRenderer(TileExteriorLightSquare2.class, new RenderExteriorLightSquare2());

        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Center.class, new RenderBridgeA_Center());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Top.class, new RenderBridgeA_X_Side_Top());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Bottom.class, new RenderBridgeA_X_Side_Bottom());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Top2.class, new RenderBridgeA_X_Side_Top2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Bottom2.class, new RenderBridgeA_X_Side_Bottom2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Side_Top.class, new RenderBridgeA_Side_Top());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Side_Bottom.class, new RenderBridgeA_Side_Bottom());

        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover0.class, new RenderRoadCover0());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover1.class, new RenderRoadCover1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover2.class, new RenderRoadCover2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover3.class, new RenderRoadCover3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover4.class, new RenderRoadCover4());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover5.class, new RenderRoadCover5());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover6.class, new RenderRoadCover6());

        ClientRegistry.bindTileEntitySpecialRenderer(TileWrappedWood1.class, new RenderWrappedWood1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWrappedWood2.class, new RenderWrappedWood2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWrappedWood3.class, new RenderWrappedWood3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWrappedWood4.class, new RenderWrappedWood4());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWrappedWood5.class, new RenderWrappedWood5());

        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_curve_3.class, new RenderOverhead_pole_curve_3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_curve_5.class, new RenderOverhead_pole_curve_5());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_curve_10.class, new RenderOverhead_pole_curve_10());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_curve_16.class, new RenderOverhead_pole_curve_16());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_8.class, new RenderOverhead_pole_scurve_8());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_8alt.class, new RenderOverhead_pole_scurve_8alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_12.class, new RenderOverhead_pole_scurve_12());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_12alt.class, new RenderOverhead_pole_scurve_12alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_16.class, new RenderOverhead_pole_scurve_16());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_scurve_16alt.class, new RenderOverhead_pole_scurve_16alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_slope_6.class, new RenderOverhead_pole_slope_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_slope_12.class, new RenderOverhead_pole_slope_12());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_slope_18.class, new RenderOverhead_pole_slope_18());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_straight_6.class, new RenderOverhead_pole_straight_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_switch_6.class, new RenderOverhead_pole_switch_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_switch_6alt.class, new RenderOverhead_pole_switch_6alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_switch_parallel.class, new RenderOverhead_pole_switch_parallel());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_pole_switch_parallelalt.class, new RenderOverhead_pole_switch_parallelalt());

        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_curve_3.class, new RenderOverhead_hanger_curve_3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_curve_5.class, new RenderOverhead_hanger_curve_5());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_curve_10.class, new RenderOverhead_hanger_curve_10());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_curve_16.class, new RenderOverhead_hanger_curve_16());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_8.class, new RenderOverhead_hanger_scurve_8());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_8alt.class, new RenderOverhead_hanger_scurve_8alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_12.class, new RenderOverhead_hanger_scurve_12());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_12alt.class, new RenderOverhead_hanger_scurve_12alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_16.class, new RenderOverhead_hanger_scurve_16());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_scurve_16alt.class, new RenderOverhead_hanger_scurve_16alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_slope_6.class, new RenderOverhead_hanger_slope_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_slope_12.class, new RenderOverhead_hanger_slope_12());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_slope_18.class, new RenderOverhead_hanger_slope_18());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_straight_6.class, new RenderOverhead_hanger_straight_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_switch_6.class, new RenderOverhead_hanger_switch_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_switch_6alt.class, new RenderOverhead_hanger_switch_6alt());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_switch_parallel.class, new RenderOverhead_hanger_switch_parallel());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_hanger_switch_parallelalt.class, new RenderOverhead_hanger_switch_parallelalt());

        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_straight_1.class, new RenderOverhead_npole_straight_1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_straight_3.class, new RenderOverhead_npole_straight_3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_straight_6.class, new RenderOverhead_npole_straight_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_slope_6.class, new RenderOverhead_npole_slope_6());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_slope_12.class, new RenderOverhead_npole_slope_12());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_slope_18.class, new RenderOverhead_npole_slope_18());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOverhead_npole_x.class, new RenderOverhead_npole_x());

        RenderingRegistry.registerBlockHandler(scaffoldRenderId, new BlockRenderScaffolds(scaffoldRenderId));
    }
}
