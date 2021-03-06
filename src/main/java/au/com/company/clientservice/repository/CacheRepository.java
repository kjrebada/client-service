package au.com.company.clientservice.repository;

import au.com.company.clientservice.entity.ClientEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository class that manages the cache
 *
 */
@Repository
public class CacheRepository {
    final Map<Long, ClientEntity> cache = new HashMap<>();

    public Map<Long, ClientEntity> getCache() {
        return cache;
    }
}
