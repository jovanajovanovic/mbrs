package myplugin.generator;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import freemarker.template.TemplateException;
import myplugin.generator.fmmodel.FMClass;
import myplugin.generator.fmmodel.FMModel;
import myplugin.generator.fmmodel.FMProperty;
import myplugin.generator.fmmodel.FMType;
import myplugin.generator.options.GeneratorOptions;

public class ModelLayerGenerator extends BasicGenerator{

	public ModelLayerGenerator(GeneratorOptions generatorOptions) {
		super(generatorOptions);
		// TODO Auto-generated constructor stub
	}
	
	public void generate() {
		try {
			super.generate();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		List<FMClass> classes = FMModel.getInstance().getClasses();
		
		
		
		
		for (int i = 0; i < classes.size(); i++) {
			FMClass cl = classes.get(i);
			Writer out;

			
			
			Map<String, Object> context = new HashMap<String, Object>();
			context.clear();
			ArrayList<FMType> imports = new ArrayList<>();
			//uzmem sve importe koji su vezani za atribute
			//paket.naziv_klase
			for(FMProperty p : cl.getProperties()){
				if(!imports.contains(p.getType())){
					imports.add(p.getType());
				}
				context.put("imports", imports);
			}
			try {
				out = getWriter(cl.getName(), cl.getTypePackage());
				if (out != null) {
					context.put("class", cl);
					context.put("properties", cl.getProperties());
					context.put("importedPackages", cl.getImportedPackages());
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

}
