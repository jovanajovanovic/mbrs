package myplugin;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import myplugin.analyzer.AnalyzeException;
import myplugin.analyzer.ModelAnalyzer;
import myplugin.generator.AngularAddEntityGenerator;
import myplugin.generator.ControllerGenerator;
import myplugin.generator.ConverterToDtoGenerator;
import myplugin.generator.ConvertertDtoToGenerator;
import myplugin.generator.DTOGenerator;
import myplugin.generator.EJBGenerator;
import myplugin.generator.EnumGenerator;
import myplugin.generator.ModelLayerGenerator;
import myplugin.generator.RepositoryGenerator;
import myplugin.generator.ServiceGenerator;
import myplugin.generator.ServiceImplGenerator;
import myplugin.generator.fmmodel.FMModel;
import myplugin.generator.options.GeneratorOptions;
import myplugin.generator.options.ProjectOptions;

/** Action that activate code generation */
@SuppressWarnings("serial")
class GenerateAction extends MDAction {

	public GenerateAction(String name) {
		super("", name, null, null);
	}

	public void actionPerformed(ActionEvent evt) {
		if (Application.getInstance().getProject() == null)
			return;
		Package root = Application.getInstance().getProject().getModel();
		if (root == null)
			return;

		//
		// //paket aplikacije koju generisemo
		// String rootDirectory = "ftn.uns.mbrs";
		// ModelAnalyzer analyzer = new ModelAnalyzer(root, rootDirectory);

		ModelAnalyzer analyzer = null;
		GeneratorOptions generatorOptions = null;

		try {
			
			generateModel(analyzer, root, generatorOptions);
			generateEnumeration(analyzer, root, generatorOptions);
			generateDtoModel(analyzer, root, generatorOptions);
			generateController(analyzer, root, generatorOptions);
			generateService(analyzer, root, generatorOptions);
			generateServiceImpl(analyzer, root, generatorOptions);
			generateRepository(analyzer, root, generatorOptions);
			generateDtoToConverter(analyzer, root, generatorOptions);
			generateToDtoConverter(analyzer, root, generatorOptions);
			generateAdd(analyzer, root, generatorOptions);
			

		} catch (AnalyzeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void generateToDtoConverter(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions) throws AnalyzeException {
		// TODO Auto-generated method stub
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.converter");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ConverterToDtoGenerator");
		ConverterToDtoGenerator converterGenerator = new ConverterToDtoGenerator(generatorOptions);
		converterGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateDtoToConverter(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions) throws AnalyzeException {
		// TODO Auto-generated method stub
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.converter");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ConverterDtoToGenerator");
		ConvertertDtoToGenerator converterGenerator = new ConvertertDtoToGenerator(generatorOptions);
		converterGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();

	}

	private void generateDtoModel(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions) throws AnalyzeException {
		// TODO Auto-generated method stub
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.dto");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("DTOGenerator");
		DTOGenerator enumGenerator = new DTOGenerator(generatorOptions);
		enumGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateEnumeration(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions) throws AnalyzeException {
		// TODO Auto-generated method stub
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.model");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("EnumerationGenerator");
		EnumGenerator enumGenerator = new EnumGenerator(generatorOptions);
		enumGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
		
	}

	private void generateModel(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.model");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ModelGenerator");
		ModelLayerGenerator ejbGenerator = new ModelLayerGenerator(generatorOptions);
		ejbGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateController(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root, "uns.ftn.mbrs.controller");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ControllerGenerator");
		ControllerGenerator controllerGenerator = new ControllerGenerator(generatorOptions);
		controllerGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateService(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root,"uns.ftn.mbrs.service");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ServiceGenerator");
		ServiceGenerator serviceGenerator = new ServiceGenerator(generatorOptions);
		serviceGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateServiceImpl(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root,"uns.ftn.mbrs.serviceimpl");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("ServiceImplGenerator");
		ServiceImplGenerator serviceImplGenerator = new ServiceImplGenerator(generatorOptions);
		serviceImplGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void generateRepository(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root,"uns.ftn.mbrs.repository");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("RepositoryGenerator");
		RepositoryGenerator repositoryGenerator = new RepositoryGenerator(generatorOptions);
		repositoryGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	// ************************ ANGULAR GENERATOR **************************

	private void generateAdd(ModelAnalyzer analyzer, Package root, GeneratorOptions generatorOptions)
			throws AnalyzeException {
		analyzer = new ModelAnalyzer(root, "add");
		analyzer.prepareModel();
		generatorOptions = ProjectOptions.getProjectOptions().getGeneratorOptions().get("AngularAddEntityGenerator");
		AngularAddEntityGenerator angularAddEditEntityGenerator = new AngularAddEntityGenerator(generatorOptions);
		angularAddEditEntityGenerator.generate();
		JOptionPane.showMessageDialog(null, "Code is successfully generated! Generated code is in folder: "
				+ generatorOptions.getOutputPath() + ", package: " + generatorOptions.getFilePackage());
		exportToXml();
	}

	private void exportToXml() {
		if (JOptionPane.showConfirmDialog(null, "Do you want to save FM Model?") == JOptionPane.OK_OPTION) {
			JFileChooser jfc = new JFileChooser();
			if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();

				XStream xstream = new XStream(new DomDriver());
				BufferedWriter out;
				try {
					out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF8"));
					xstream.toXML(FMModel.getInstance().getClasses(), out);
					xstream.toXML(FMModel.getInstance().getEnumerations(), out);

				} catch (UnsupportedEncodingException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		}
	}

}