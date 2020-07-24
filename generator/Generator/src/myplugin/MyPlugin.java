package myplugin;

import java.io.File;

import javax.swing.JOptionPane;

import myplugin.generator.options.GeneratorOptions;
import myplugin.generator.options.ProjectOptions;


import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;

/** MagicDraw plugin that performes code generation */
public class MyPlugin extends com.nomagic.magicdraw.plugins.Plugin {
	
	String pluginDir = null; 
	
	public void init() {
		JOptionPane.showMessageDialog( null, "My Plugin init");
		
		pluginDir = getDescriptor().getPluginDirectory().getPath();
		
		// Creating submenu in the MagicDraw main menu 	
		ActionsConfiguratorsManager manager = ActionsConfiguratorsManager.getInstance();		
		manager.addMainMenuConfigurator(new MainMenuConfigurator(getSubmenuActions()));
		
		/** @Todo: load project options (@see myplugin.generator.options.ProjectOptions) from 
		 * ProjectOptions.xml and take ejb generator options */
		
//	
		
		
//		//for test purpose only:
//		GeneratorOptions ejbOptions = new GeneratorOptions("c:/temp", "ejbclass", "templates", "{0}.java", true, "ejb"); 				
//		ProjectOptions.getProjectOptions().getGeneratorOptions().put("EJBGenerator", ejbOptions);
//				
//		ejbOptions.setTemplateDir(pluginDir + File.separator + ejbOptions.getTemplateDir()); //apsolutna putanja
		//for test purpose only:
		modelOptions();
		enumerationOptions();
		dtoModelOptions();
		controllerOptions();
		serviceOptions();
		converterToDtoOptions();
		converterDtoToOptions();
		serviceImplOptions();
		repositoryOptions();
		angularAddOptions();
	}
	
	private void converterDtoToOptions() {
		// TODO Auto-generated method stub
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "converterDtoToclass", "templates", "{0}.java", true, "uns.ftn.mbrs.converter"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ConverterDtoToGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}

	private void converterToDtoOptions() {
		// TODO Auto-generated method stub
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "converterclass", "templates", "{0}.java", true, "uns.ftn.mbrs.converter"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ConverterToDtoGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}

	private void dtoModelOptions() {
		// TODO Auto-generated method stub
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "dtoclass", "templates", "{0}DTO.java", true, "uns.ftn.mbrs.dto"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("DTOGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
		
	}

	private void enumerationOptions() {
		// TODO Auto-generated method stub
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "enum", "templates", "{0}.java", true, "uns.ftn.mbrs.model"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("EnumerationGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
		
	}

	private void modelOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "modelclass", "templates", "{0}.java", true, "uns.ftn.mbrs.model"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ModelGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void controllerOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "controllerclass", "templates", "{0}Controller.java", true, "uns.ftn.mbrs.controller"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ControllerGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void serviceOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "serviceclass", "templates", "{0}Service.java", true, "uns.ftn.mbrs.service"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ServiceGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void serviceImplOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "serviceimplclass", "templates", "{0}ServiceImpl.java", true, "uns.ftn.mbrs.serviceimpl"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ServiceImplGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void repositoryOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/Users/DELL/Desktop/mbrs/mbrs/src/main/java", "repositoryclass", "templates", "{0}Repository.java", true, "uns.ftn.mbrs.repository"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("RepositoryGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	//********* ANGULAR **************
	
	private void angularAddOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp/angular/src/app", "addEntity", "templates", "{0}Add.html", true, "add"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("AngularAddEntityGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}

	private NMAction[] getSubmenuActions()
	{
	   return new NMAction[]{
			new GenerateAction("Generate"),
	   };
	}
	
	public boolean close() {
		return true;
	}
	
	public boolean isSupported() {				
		return true;
	}
}


