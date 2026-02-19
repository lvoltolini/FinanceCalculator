package com.github.lvoltolini.FinanceCalculator.core.pipeline;


import com.github.lvoltolini.FinanceCalculator.core.data.DataMatrix;

public interface PipelineStep
{
    DataMatrix process(DataMatrix input);
}
