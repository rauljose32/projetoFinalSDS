package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.HotelQuarto;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author raul
 */
@Path("/quarto")
@Transactional
public class HotelQuartoResource {

    @Inject
    private DAO<HotelQuarto> dao;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(HotelQuarto quarto) {
        dao.save(quarto);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(HotelQuarto quarto) {
        dao.save(quarto);
    }

    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean delete(@PathParam("id") long id) {
        HotelQuarto quarto = dao.findById(id);
        return dao.remove(quarto);
    }

}
