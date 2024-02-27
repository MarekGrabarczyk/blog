package pl.javaready.readerArtilceRetriever;

public class ReaderArticleRetrieverFacade {
    public ArticleDto retrieveById(Long id){
        return ArticleDto.builder()
                .content("5 krokow: 1, 2, 3, 4, 5")
                .header("jak zostac programista")
                .id(1L)
                .category("IT")
                .build();

    }
}
