package Services;

import ElasticSearch.ElasticClient;
import Model.Automobil;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;

import java.io.IOException;
import java.util.List;


public class AutomobiliService {
    private final ElasticsearchClient client = ElasticClient.getElasticSearchClientInstance();

    public List<Automobil> getAllAutomobili() throws IOException {
            SearchResponse<Automobil> result= client.search( i-> i.index("automobili").query(q-> q.matchAll(m->m)), Automobil.class);
            return result.hits().hits().stream().map(Hit::source).toList();
    }
}
