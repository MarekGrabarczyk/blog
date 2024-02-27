package pl.javaready.readerArtilceRetriever;

import org.junit.jupiter.api.Test;

class ReaderArticleRetrieverFacadeTest {

    @Test
    public void shouldReturnArticleWithId1AndContentXXX(){
        //given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();

        //when
        ArticleDto articleDto = facade.retrieveById(1L);
        //then
        assert articleDto.id().equals(1L);
        assert articleDto.content().equals("5 krokow: 1, 2, 3, 4, 5");
        assert articleDto.header().equals("jak zostac programista");
        assert articleDto.category().equals("IT");
    }

}