package com.raywenderlich.reposearch;

import java.util.ArrayList;

/**
 * Created by michaeltoth on 2/28/18.
 */

public interface DownloadCompleteListener {
    void downloadComplete(ArrayList<Repository> repositories);
}
