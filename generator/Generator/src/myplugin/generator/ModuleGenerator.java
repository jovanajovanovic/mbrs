package myplugin.generator;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import freemarker.template.TemplateException;
import myplugin.generator.fmmodel.FMClass;
import myplugin.generator.fmmodel.FMModel;
import myplugin.generator.options.GeneratorOptions;

public class ModuleGenerator extends BasicGenerator {

	public ModuleGenerator(GeneratorOptions generatorOptions) {
		super(generatorOptions);
	}
	
	public void generate() throws IOException {

		try {
			super.generate();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		Writer out = getWriter("app.module", "");
		List<FMClass> classes = FMModel.getInstance().getClasses();
		Map<String, Object> context = new HashMap<String, Object>();
		try {
			
			if (out != null) {
				context.clear();
				context.put("classes", classes);
				getTemplate().process(context, out);
				out.flush();
			}
		} catch (TemplateException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}