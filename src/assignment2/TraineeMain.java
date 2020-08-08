package assignment2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	public static void main(String args[]) {
		TraineeMain s=new TraineeMain();
		s.runApp();
	}
		Map<Integer,Trainee> map=new HashMap<Integer,Trainee>();
		Set<CSTrainee> cs=new HashSet();
		Set<ECETrainee> ECE=new HashSet();
		public void runApp() {
			Trainee trainee1=new CSTrainee(1,"yasaswini",9);
			Trainee trainee2=new ECETrainee(2,"navya","multimeter");
			Trainee trainee3=new CSTrainee(3,"lalli",10);
			Trainee trainee4=new ECETrainee(4,"maneesha","ammeter");
			map.put(trainee1.getId(), trainee1);
			map.put(trainee2.getId(), trainee2);
			map.put(trainee3.getId(), trainee3);
			map.put(trainee4.getId(), trainee4);
			for(Trainee trainee:map.values()) {
				Trainee t=(Trainee) trainee;
				boolean iscs=t instanceof CSTrainee;
				if(iscs) {
					cs.add((CSTrainee) t);
				}
				else {
					ECE.add((ECETrainee) t);
				}
				
			}
			System.out.println("displaying cse");
			for(CSTrainee cse:cs) {
				int id=cse.getId();
				String name=cse.getName();
				int langauges=cse.getLanguages();
				System.out.println("id is="+id+"name is="+name+"languages is="+langauges);
				
				
			}
			System.out.println("displaying ece");
			for(ECETrainee ece:ECE) {
				int id=ece.getId();
				String name=ece.getName();
				String deviceUsed=ece.getDeviceUsed();
				System.out.println("id is="+id+"name is="+name+"device used is="+deviceUsed);
			}


			
			


			
			
			
			
			
			
		}
		
		
		
		
		
	}


