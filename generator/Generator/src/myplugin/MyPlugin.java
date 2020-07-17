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
		//for test purpose only:
		ejbOptions();
		controllerOptions();
		serviceOptions();
		serviceImplOptions();
		repositoryOptions();
		angularAddEditOptions();
	}
	
	private void ejbOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "ejbclass", "templates", "{0}.java", true, "ejb"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("EJBGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void controllerOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "controllerclass", "templates", "{0}Controller.java", true, "controller"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ControllerGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void serviceOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "serviceclass", "templates", "{0}Service.java", true, "service"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ServiceGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void serviceImplOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "serviceimplclass", "templates", "{0}ServiceImpl.java", true, "serviceimpl"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ServiceImplGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void repositoryOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "repositoryclass", "templates", "{0}Repository.java", true, "repository"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("RepositoryGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	//********* ANGULAR **************
	
	private void angularAddEditOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "addEditEntity", "templates", "{0}AddEdit.java", true, "AddEdit"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("AngularAddEditEntityGenerator", generatorOptions);
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


