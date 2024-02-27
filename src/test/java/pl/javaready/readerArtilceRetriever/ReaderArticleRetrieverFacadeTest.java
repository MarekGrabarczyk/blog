package pl.javaready.readerArtilceRetriever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderArticleRetrieverFacadeTest {

    @Test
    public void f(){
        //given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();

        //when
        ArticleDto articleDto = facade.retrieveById(1L);
        //then
    }

}