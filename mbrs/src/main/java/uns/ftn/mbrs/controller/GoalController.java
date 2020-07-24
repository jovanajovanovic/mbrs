package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.service.GoalService;
import uns.ftn.mbrs.converter.GoalDTOToGoal;
import uns.ftn.mbrs.converter.GoalToGoalDTO;
import uns.ftn.mbrs.dto.GoalDTO;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/goal")
public class GoalController {  

	@Autowired
	private GoalService goalService;
	
	@Autowired
	private GoalToGoalDTO toDTO;
	
	@Autowired
	private GoalDTOToGoal toGoal;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalList () {

		List<Goal> goalList = goalService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<GoalDTO> getGoal(@PathVariable Long id) {
		Goal goal = goalService.findOne(id);
		if (goal == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(goal), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<GoalDTO> add(@RequestBody @Valid GoalDTO newGoal) {

		Goal savedGoal = goalService.save(toGoal.convert(newGoal));

		return new ResponseEntity<>(toDTO.convert(savedGoal), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<GoalDTO> edit(@RequestBody @Valid GoalDTO goal, @PathVariable Long id) {

		if (id != goal.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Goal persisted = goalService.save(toGoal.convert(goal));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<GoalDTO> delete(@PathVariable Long id) {
		Goal deleted = goalService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByTitle/{value}", method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalListByTitle(@PathVariable myplugin.generator.fmmodel.FMType@6a4381b3 value) {

		List<Goal> goalList = goalService.findByTitle(value);
			
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDuration/{value}", method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalListByDuration(@PathVariable myplugin.generator.fmmodel.FMType@6d69bcd9 value) {

		List<Goal> goalList = goalService.findByDuration(value);
			
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDate/{value}", method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalListByDate(@PathVariable myplugin.generator.fmmodel.FMType@208757f1 value) {

		List<Goal> goalList = goalService.findByDate(value);
			
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDistance/{value}", method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalListByDistance(@PathVariable myplugin.generator.fmmodel.FMType@2897389e value) {

		List<Goal> goalList = goalService.findByDistance(value);
			
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByAchieved/{value}", method = RequestMethod.GET)
	ResponseEntity<List<GoalDTO>> getGoalListByAchieved(@PathVariable myplugin.generator.fmmodel.FMType@5eaf7a26 value) {

		List<Goal> goalList = goalService.findByAchieved(value);
			
		return new ResponseEntity<>(toDTO.convert(goalList), HttpStatus.OK);
	}

}
