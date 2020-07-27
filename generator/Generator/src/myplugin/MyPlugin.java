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
		controllerOptions();
		serviceOptions();
		serviceImplOptions();
		repositoryOptions();
		angularAddOptions();
		angularModule();
		angularRoute();
		angularService();
		angularAddOptionsTs();
		angularEditOptions();
		angularEditOptionsTs();
	}
	
	private void enumerationOptions() {
		// TODO Auto-generated method stub
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "enum", "templates", "{0}.java", true, "model"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("EnumerationGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
		
	}

	private void modelOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("c:/temp", "modelclass", "templates", "{0}.java", true, "model"); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ModelGenerator", generatorOptions);
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
	
	private void angularModule() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "module", "templates", "{0}.ts", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ModuleGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularRoute() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "routing", "templates", "{0}.ts", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("RoutingGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularService() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "service", "templates", "{0}.ts", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("ServiceFrontGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularAddOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "addEntity", "templates", "{0}.html", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("AngularAddEntityGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularAddOptionsTs() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "typescript", "templates", "{0}.ts", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("TypescriptGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularEditOptions() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "editEntity", "templates", "{0}.html", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("AngularEditEntityGenerator", generatorOptions);
		generatorOptions.setTemplateDir(pluginDir + File.separator + generatorOptions.getTemplateDir());
	}
	
	private void angularEditOptionsTs() {
		GeneratorOptions generatorOptions = new GeneratorOptions("C:\\Users\\JOVAN\\Desktop\\MBRS\\AngularProject\\mbrs-front\\src\\app", "editTypescript", "templates", "{0}.ts", true, ""); 				
		ProjectOptions.getProjectOptions().getGeneratorOptions().put("EditTypescriptGenerator", generatorOptions);
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


