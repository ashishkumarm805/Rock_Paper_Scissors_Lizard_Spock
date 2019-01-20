package com.ashishkumarm.sprockpaperslizard.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.ashishkumarm.sprockpaperslizard.R;
import com.ashishkumarm.sprockpaperslizard.data.GameAssets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MasterFragment extends Fragment {

    public MasterFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_master,container,false);
        GridView gridView= rootView.findViewById(R.id.moves_grid_view);
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), GameAssets.getGameMoves());

        gridView.setAdapter(mAdapter);

        return rootView;
    }

}
