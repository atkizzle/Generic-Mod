package tutorial.generic;

import net.minecraft.src.Block;
import net.minecraft.src.ItemSeeds;
import net.minecraft.src.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class GenericSeed extends ItemSeeds implements IPlantable {

    public GenericSeed (int id) {
        super(id, Generic.tomatoCrop.blockID, Block.tilledField.blockID);
    }

    @Override
    public EnumPlantType getPlantType (World world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    @Override
    public int getPlantID (World world, int x, int y, int z) {
        return 0;
    }

    @Override
    public int getPlantMetadata (World world, int x, int y, int z) {
        return 0;
    }

}
