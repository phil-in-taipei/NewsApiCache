package NewYorkTimesApiCache.NewYorkTimesApiCache.controllers;
import NewYorkTimesApiCache.NewYorkTimesApiCache.models.Article;
import NewYorkTimesApiCache.NewYorkTimesApiCache.models.Doc;
import NewYorkTimesApiCache.NewYorkTimesApiCache.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NytTestController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/nyt/test")
    public List<Article> getMostPopular() {
        return articleService.getMostPopular();
    }

    @GetMapping("/nyt/search/test")
    public List<Doc> getSearchResults() {
        return articleService.getSearchResults("covid");
    }

}
