package pixelmon.Pokemon;

import net.minecraft.src.World;
import pixelmon.entities.BaseEntityPixelmon;
import pixelmon.entities.EntityGroundPixelmon;

public class EntitySolrock  extends EntityGroundPixelmon
{
	
	public EntitySolrock(World world)
	{
		super(world);
		texture = "/pixelmon/image/solrock.png";
		init();
	}

	public void init()
	{
		name = "Solrock";
		isImmuneToFire = true;
		doesHover = true;
		hoverHeight=1f;
		super.init();
	}
	
	public void evolve() 
	{		
		
	}
	
	public boolean getCanSpawnHere() {
		if (worldObj.isDaytime()) 
			return true;

	return true;
}
}