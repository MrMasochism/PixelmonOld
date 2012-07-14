package pixelmon.attacks;

import java.util.ArrayList;

import pixelmon.entities.IHaveHelper;

public class BattleRegistry {
	private ArrayList<BattleController> battleList;
	
	public BattleRegistry(){
		battleList = new ArrayList<BattleController>();
	}
	
	public void registerBattle(BattleController bc){
		battleList.add(bc);
	}
	
	public int getIndex(BattleController bc){
		for (int i=0;i < battleList.size(); i++){
			if (battleList.get(i) == bc) return i;
		}
		return -1;
	}
	
	public BattleController getBattle(int index){
		return battleList.get(index);
	}
	
	public void deRegisterBattle(BattleController bc){
		for (int i=0; i < battleList.size(); i++)
		{
			if (battleList.get(i) == bc){
				battleList.remove(i);
				return;
			}
		}
	}

	public boolean pokemonInBattle(IHaveHelper pixelmon) {
		for(BattleController bc:battleList){
			if (bc.participant1.currentPokemon() == pixelmon.getHelper() || bc.participant2.currentPokemon() == pixelmon.getHelper())
				return true;
		}
		return false;
	}
}
