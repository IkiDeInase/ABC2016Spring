package jp.android_group.student.abc2016spring.domain.repository;

import java.util.List;

import jp.android_group.student.abc2016spring.domain.model.Conference;

/**
 * Created by kinagafuji on 16/02/29.
 */
public interface MyScheConferenceRepository {
    void loadMyScheConference(MyScheConferenceRepositoryCallback cb);

    interface MyScheConferenceRepositoryCallback {
        void onSuccess(List<Conference> conferenceList);

        void onFailure();
    }
}