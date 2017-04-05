package com.liutao.train.freemarker;

import freemarker.template.SimpleNumber;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

import java.util.List;

/**
 * Created by liutao on 17-4-5.
 */
public class IndexOfMethod implements TemplateMethodModelEx {
    @Override
    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() != 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        String param1 = args.get(1).toString();
        String param2 = args.get(0).toString();
        return new SimpleNumber(param1.indexOf(param2));
    }
}
