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
public class GoalToGoalDTO implements Converter<Goal, GoalDTO> {


	@Override
	public GoalDTO convert(Goal goal) {
		GoalDTO dto = new GoalDTO();
		
		dto.setId(goal.getId());
		dto.setTitle(goal.getTitle());

		dto.setDuration(goal.getDuration());

		dto.setDate(goal.getDate());

		dto.setDistance(goal.getDistance());

		dto.setAchieved(goal.getAchieved());

		return dto;
	}
	
	public List<GoalDTO> convert(List<Goal> goalList){
		List<GoalDTO> goalDTOList = new ArrayList<>();
		
		for(Goal goal : goalList){
			goalDTOList.add(convert(goal));
		}
		
		return goalDTOList;
	}
}