package edu.cnm.deepdive.codebreaker.service;

import edu.cnm.deepdive.codebreaker.model.dao.PerformanceRepository;
import edu.cnm.deepdive.codebreaker.view.Performance;
import org.springframework.stereotype.Service;

@Service
public class PerformanceService implements AbstractPerformanceService {

  private final PerformanceRepository repository;

  public PerformanceService(PerformanceRepository repository) {
    this.repository = repository;
  }

  @Override
  public Iterable<Performance> getRankingsByDuration(int poolSize, int codeLength, int count) {
    return repository.getRankingsByTime(poolSize, codeLength, count);
  }

  @Override
  public Iterable<Performance> getRankingsByGuessCount(int poolSize, int codeLength, int count) {
    return repository.getRankingsByGuesses(poolSize, codeLength, count);
  }
}
