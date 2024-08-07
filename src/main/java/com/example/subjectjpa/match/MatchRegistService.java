package com.example.subjectjpa.match;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchRegistService {

    private MatchRepository matchRepository;

    @Autowired
    public MatchRegistService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Transactional
    public void registMatch(MatchRegistRequestDTO matchInfo) {

        Match match = new Match(
                matchInfo.getMyClubId(),
                matchInfo.getMyClubName(),
                matchInfo.getEnemyClubId(),
                matchInfo.getEnemyClubName(),
                matchInfo.getMatchPhoto(),
                matchInfo.getMatchDescription(),
                matchInfo.getMatchDate(),
                matchInfo.getMatchStartTime(),
                matchInfo.getMatchEndTime(),
                matchInfo.getMatchPlayerQuantity(),
                matchInfo.getQuarterQuantity(),
                matchInfo.getFieldLocation(),
                matchInfo.getMatchCost(),
                matchInfo.getNativePlayer(),
                matchInfo.getClubLevel(),
                matchInfo.getMatchGender(),
                matchInfo.getMatchStatus()
        );

        matchRepository.save(match);
    }
}
