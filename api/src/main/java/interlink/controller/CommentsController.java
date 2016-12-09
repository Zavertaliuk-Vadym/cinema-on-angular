package interlink.controller;

import interlink.model.Comments;
import interlink.model.Movie;
import interlink.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "")
public class CommentsController {
    @Autowired
    CommentsService commentsService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    List<Comments> home() {
        return commentsService.getAllComm();
    }

    @RequestMapping(value = "/api/comm", method = RequestMethod.GET)
    @ResponseBody
    List<Comments> getAllComm() {
        return commentsService.getAllComm();
    }
}
