/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ilb.testjavadoc.web;

import io.swagger.annotations.Api;
import java.util.List;
import java.util.UUID;
import javax.ws.rs.Path;
import ru.ilb.testjavadoc.model.Document;
import ru.ilb.testjavadoc.model.Documents;
import ru.ilb.testjavadoc.api.DocumentsResource;
import ru.ilb.testjavadoc.model.ReadOptionsType;

@Path("documents")
@Api("documents")
public class DocumentResourceImpl implements DocumentsResource {

    @Override
    public Documents list(List<ReadOptionsType> options, String filter, Integer limit, String order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID create(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Document find(UUID uid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(UUID uid, Document document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(UUID uid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
