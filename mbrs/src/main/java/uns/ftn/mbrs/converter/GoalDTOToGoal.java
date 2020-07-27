package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.dto.GoalDTO;
import uns.ftn.mbrs.service.GoalService;

@Component
public class GoalDTOToGoal implements Converter<GoalDTO, Goal>{

	@Autowired
	private UserDTOToUser toUser;
	
	@Autowired
	GoalService goalService;
	
	@Override
	public Goal convert(GoalDTO dto){
		Goal goal = new Goal();
		
		if (dto.getId() != null) {
			goal = goalService.findOne(dto.getId());
			
			if(goal == null){
				throw new IllegalStateException("goal not exists in db");
			}
		}
		
		goal.setId(dto.getId());
		
			goal.setTitle(dto.getTitle());

			goal.setDuration(dto.getDuration());

			goal.setDate(dto.getDate());

			goal.setDistance(dto.getDistance());

			goal.setAchieved(dto.getAchieved());

		if (dto.getUser() != null){
			goal.setUser(toUser.convert(dto.getUser()));
		}	
		
		return goal;
	}
	
	public List<Goal> convert (List<GoalDTO> goalDTOList){
		List<Goal> goalList = new ArrayList<>();
		
		for(GoalDTO dto : goalDTOList){
			goalList.add(convert(dto));
		}
		
		return goalList;
	}
	
	
}