package subreddit.android.appstore.screens.details;

import subreddit.android.appstore.backend.data.AppInfo;
import subreddit.android.appstore.util.mvp.BasePresenter;
import subreddit.android.appstore.util.mvp.BaseView;


public interface AppDetailsContract {
    interface View extends BaseView {

        void onShowDetails(AppInfo appInfo);

        void closeDetails();
    }

    interface Presenter extends BasePresenter<View> {

    }
}
